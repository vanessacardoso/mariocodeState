public class MarioFogo implements MarioState {

    public MarioState pegarCogumelo() {
        System.out.println("Ganhou 1000 pontos");
        return this;
    }

    public MarioState pegarFlor() {
        System.out.println("Ganhou 1000 pontos");
        return this;
    }

    public MarioState pegarPena() {
        System.out.println("Mario Grande com capa");
        return new MarioCapa();
    }

    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
}
