package s13_Enumeracao_Composicao.Composicao.Comentarios;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postes {
    private Date momento;
    private String title;
    private String content;
    private Integer likes;

    List<Coments> comentarios = new ArrayList<>();

    public Postes() {

    }

    public Postes(Date momento, String title, String content, Integer likes) {
        this.momento = momento;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coments> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Coments comentario) {
        this.comentarios.add(comentario);
    }

    public void removeComentarios(Coments comentario) {
        this.comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sBuilder = new StringBuilder(); // armazena uma string muitissimo grande. acelera o probgrama, nao
                                                      // fica pesado
        sBuilder.append(title + "\n");
        sBuilder.append(likes);
        sBuilder.append(" Likes - ");
        sBuilder.append(sdf.format(momento) + "\n");
        sBuilder.append(content + "\n");
        sBuilder.append("Comentarios: \n");
        for (Coments c : comentarios) {
            sBuilder.append("- " + c.getTexto() + "\n");
        }
        return sBuilder.toString();
    }
}
