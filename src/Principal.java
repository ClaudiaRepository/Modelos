public class Principal {

    public static void main(String[] args) {
        Mano mano1 = new Mano();
        mano1.agregarCarta(new Carta(4, "Espadas"));
        mano1.agregarCarta(new Carta(5, "Espadas"));
        mano1.agregarCarta(new Carta(6, "Espadas"));

        Mano mano2 = new Mano();
        mano2.agregarCarta(new Carta(10, "Bastos"));
        mano2.agregarCarta(new Carta(11, "Bastos"));
        mano2.agregarCarta(new Carta(12, "Bastos"));
        mano2.agregarCarta(new Carta(1, "Bastos"));

        Mano mano3 = new Mano();
        mano3.agregarCarta(new Carta(7, "Oros"));
        mano3.agregarCarta(new Carta(10, "Oros"));
        mano3.agregarCarta(new Carta(11, "Oros"));
        mano3.agregarCarta(new Carta(12, "Oros"));
        mano3.agregarCarta(new Carta(1, "Oros"));


    }

}