package proyectopilas;

public class Pila {

    //Atributos
    int Limite, Tope, Vector[];

    public Pila(int n) {
        this.Limite = n - 1;
        this.Tope = -1;
        this.Vector = new int[n];
    }

    public boolean PilaVacia() {
        if (Tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PilaLlena() {
        boolean B = false;
        if (Tope == Limite) {
            B = true;
        }
        return B;
    }

    void Apilar(int d) {
        Tope++;
        Vector[Tope] = d;
    }

    int Desapilar() {
        int auxi = Vector[Tope];
        Tope--;
        return auxi;
    }

    void PasarDatos(Pila aux, Pila P1) {
        int Auxiliar;
        while(aux.PilaVacia() == false)
        {
            Auxiliar = P1.Desapilar();
            aux.Apilar(Auxiliar);      
        }
    }
    
     public String Mostrar(Pila aux, int auxi) {
        String s = " ";
        while (PilaVacia() != true){
            s = s + "|" + Desapilar() + "|\n ";
            aux.Apilar(auxi);
        }
        return s;
    }
}
