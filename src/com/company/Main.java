package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(25);
        cliente1.setNombre("Spiderman");
        cliente1.setTelefono("78787878");
        cliente1.setCredito(3000);
        System.out.println("Nombre: "+ cliente1.getNombre()+", Edad: "+ cliente1.getEdad()+", Telefono: "+ cliente1.getTelefono()+", Credito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(36);
        trabajador1.setNombre("Ironman");
        trabajador1.setTelefono("26262626");
        trabajador1.setSalario(130000);
        System.out.println("Nombre: "+ trabajador1.getNombre()+", Edad: "+ trabajador1.getEdad()+", Telefono: "+ trabajador1.getTelefono()+", Salario: "+trabajador1.getSalario());
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}