package exerciciosDasAulas;

public class ObjetosEx17 {

    private double metrosQ;
    private double tintaComFolga;

    public ObjetosEx17(double metrosQ) {
        this.metrosQ = metrosQ;
        // 1 litro para cada 6m²
        double tintaNecessaria = metrosQ / 6.0;
        // Adiciona 10% de folga (multiplicando por 1.10)
        this.tintaComFolga = tintaNecessaria * 1.10;
    }
    public void exibirApenasLatas() {
        double latas = Math.ceil(this.tintaComFolga / 18.0);
        double precoTotal = latas * 80.0;
        System.out.println("Opção 1 (Apenas Latas 18L)  -> Qtd: " + (int) latas + " | Preço: R$ " + precoTotal);
    }
    public void exibirApenasGaloes() {
        double galoes = Math.ceil(this.tintaComFolga / 3.6);
        double precoTotal = galoes * 25.0;
        System.out.println("Opção 2 (Apenas Galões 3.6L) -> Qtd: " + (int) galoes + " | Preço: R$ " + precoTotal);
    }
    public void exibirMisturaOtimizada() {
        // Pega a parte inteira de latas grandes de 18L que cabem no volume total
        int latasMistura = (int) (this.tintaComFolga / 18.0);

        // Descobre quanta tinta sobrou usando o operador de resto (%)
        double tintaRestante = this.tintaComFolga % 18.0;

        // Completa o resto com galões de 3.6L, arredondando para cima
        int galoesMistura = (int) Math.ceil(tintaRestante / 3.6);

        // Calcula o preço final somando os dois tipos
        double precoTotal = (latasMistura * 80.0) + (galoesMistura * 25.0);

        System.out.println("Opção 3 (Mistura Otimizada)  -> Latas: " + latasMistura + " e Galões: " + galoesMistura + " | Preço: R$ " + precoTotal);
    }
}
