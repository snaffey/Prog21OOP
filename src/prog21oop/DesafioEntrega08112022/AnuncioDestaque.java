package prog21oop.DesafioEntrega08112022;

import java.sql.Blob;

public class AnuncioDestaque {
    // Guardar imagem em blob
    public Blob imagem;

    public AnuncioDestaque(Blob imagem) {
        this.imagem = imagem;
    }
}
