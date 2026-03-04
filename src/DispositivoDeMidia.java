// Esta é uma classe abstrata. Ela serve como um "contrato" ou molde.
// Não podemos criar um objeto 'new DispositivoDeMidia()'.
// Ela define o que todo dispositivo de mídia DEVE ter.
public abstract class DispositivoDeMidia { // 6 usages 3 implementations

    protected String nomeDoDispositivo; // 6 usages

    public DispositivoDeMidia(String nome) { // 3 usages
        this.nomeDoDispositivo = nome;
    }

    // Este é um método abstrato. Ele não tem implementação (sem {}).
    // Ele FORÇA todas as Classes filhas a criarem sua própria versão
    // do método 'reproduzir()'. Este é o nosso "botão Play" conceitual.
    public abstract void reproduzir(); // 2 usages 3 implementations

    // Classes abstratas também podem ter métodos concretos (com implementação)
    // que serão herdados normalmente por todas as filhas.
    public void desligar() { // no usages
        System.out.println(this.nomeDoDispositivo + " está desligando.");
    }
}
