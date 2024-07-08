package org.Logica;

import java.time.LocalTime;

public class Director {
    public Director() {}
    public void Bus1PisoSimple(Builder b, String horario) {
        b.reset();
        b.setAsientos(20, 12, 0);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
    public void Bus2PisosSimple(Builder b, String horario) {
        b.reset();
        b.setAsientos(40, 24, 0);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
    public void Bus1PisoMedio(Builder b, String horario) {
        b.reset();
        b.setAsientos(16, 12, 4);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
    public void Bus2PisosMedio(Builder b, String horario) {
        b.reset();
        b.setAsientos(32, 20, 12);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
    public void Bus1PisoDeluxe(Builder b, String horario) {
        b.reset();
        b.setAsientos(0, 16, 16);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
    public void Bus2PisosDeluxe(Builder b, String horario) {
        b.reset();
        b.setAsientos(0, 32, 32);
        switch (horario) {
            case "Matutino": b.setHorario(LocalTime.of(6, 0)); break;
            case "Mediodia": b.setHorario(LocalTime.of(12, 0)); break;
            case "Tarde": b.setHorario(LocalTime.of(18, 0)); break;
            case "Nocturno": b.setHorario(LocalTime.of(0, 0)); break;
        }
    }
}
