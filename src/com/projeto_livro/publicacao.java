package com.projeto_livro;
public interface publicacao {
    String detalhes();

    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
