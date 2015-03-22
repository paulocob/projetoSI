package controllers;


import static play.data.Form.form;

import java.util.List;

import controllers.Usuario;
import models.GenericDAO;
import models.GenericDAOImpl;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.Form;
import play.db.jpa.Transactional;
import views.html.*;

public class Autenticador extends Controller {

    private static GenericDAO dao = new GenericDAOImpl();
    private static Form<Usuario> usuarioForm = form(Usuario.class).bindFromRequest();

    @Transactional
    public static Result showLogin() {
        if (session().get("user") != null) {
            return redirect(routes.Application.index());
        }
        return okSucessoLogin("");
    }

    @Transactional
    public static Result showCadastro() {
        return okSucessoCadastro("");
    }

    @Transactional
    public static Result logout() {
        session().clear();
        return showLogin();
    }

    @Transactional
    public static Result autenticar() {

        Form<Usuario> form = usuarioForm.bindFromRequest();

        String login = form.field("login").value();
        String senha = form.field("senha").value();

        if (isDadosInvalidosLogin(login, senha)) {
            return okErroLogin("Login ou senha inválidos");
        } else {
            Usuario user = (Usuario) dao.findByAttributeName("Usuario",
                    "login", login).get(0);
            session().clear();
            session("user", user.getLogin());
            return redirect(routes.Application.index());
        }
    }

    private static boolean isDadosInvalidosLogin(String login, String senha) {
        return usuarioForm.hasErrors() || !validarDadosLogin(login, senha);
    }

    private static boolean validarDadosLogin(String login, String senha) {
        List<Usuario> u = dao.findByAttributeName("Usuario", "login", login);
        if (u == null || u.isEmpty()) {
            return false;
        }
        if (!u.get(0).getSenha().equals(senha)) {
            return false;
        }
        return true;
    }

    @Transactional
    public static Result cadastrar() {

        Form<Usuario> form = usuarioForm.bindFromRequest();

        String nome = form.field("nome").value();
        String login = form.field("login").value();
        String senha = form.field("senha").value();
        String confirmaSenha = form.field("confirmaSenha").value();

        if (!senha.equals(confirmaSenha)) {
            return okErroCadastro("Senhas não correspondem");
        }

        Usuario user = null;

        try {
            user = new Usuario(nome, login, senha);
        } catch (Exception e) {
            return okErroCadastro(e.getMessage());
        }

        if (validacaoLogin(login)) {
            return okErroCadastro("Login já está em uso");
        }


        Application.salvaObjeto(user);
        return okSucessoLogin("Cadastrado com sucesso");

    }

    @Transactional
    public static Result okErroLogin(String mensagem) {
        return ok(login.render(usuarioForm, mensagem, ""));
    }

    @Transactional
    public static Result okErroCadastro(String mensagem) {
        return ok(cadastro.render(usuarioForm, mensagem, ""));
    }

    @Transactional
    public static Result okSucessoLogin(String mensagem) {
        return ok(login.render(usuarioForm, "", mensagem));
    }

    @Transactional
    public static Result okSucessoCadastro(String mensagem) {
        return ok(cadastro.render(usuarioForm, "", mensagem));
    }

    private static boolean validacaoLogin(String login) {
        List<Usuario> u = dao.findByAttributeName(Usuario.class.getName(), "login", login);

        for (Usuario usuario : u) {
            if (usuario.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }



}
