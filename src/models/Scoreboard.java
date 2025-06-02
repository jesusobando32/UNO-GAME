package models;
import models.game.Jugador;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;

public class Scoreboard {
    public LinkedList<Jugador> jugadores;


    public Scoreboard() {}

    public void crear() {
        this.jugadores = new LinkedList<>();
    }
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

    public void ordenar() {
        this.jugadores.sort(new Comparator<Jugador>() {
            public int compare(Jugador jugador1, Jugador jugador2) {
                return Integer.compare(jugador2.getPuntajeTotal(), jugador1.getPuntajeTotal());
            }
        });
    }

    public boolean buscar(Jugador jugador1) {
        for (Jugador jugador : jugadores) {
            if (Objects.equals(jugador.getNombre(), jugador1.getNombre())) {
                return true;
            }
        }
        return false;
    }
    public void reemplazar(Jugador jugador1) {
        for (Jugador jugador : jugadores) {
            if (Objects.equals(jugador.getNombre(), jugador1.getNombre())) {
                jugador.setPuntajeTotal(jugador1.getPuntajeTotal());
            }
        }
    }

    public void imprimir() {
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador " + jugador.getNombre() + ", puntaje " + jugador.getPuntajeTotal());
        }
    }
}