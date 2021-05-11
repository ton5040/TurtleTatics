package Jogo.itens;
import Jogo.personagens.Personagem;

public class Couraca extends Item {
  public Couraca() {
    super("Couraça", 3);
  }

  @Override
  public void efeito(Personagem Pafetado) {
    Pafetado.setValorDefesa(Pafetado.getValorDefesa() + 25);
  }
}