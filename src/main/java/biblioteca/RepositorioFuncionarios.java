package biblioteca;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;

public class RepositorioFuncionarios extends RepositorioGenerico<Funcionarios> {
    
    public RepositorioFuncionarios(String arquivo){
        super(arquivo);
    }

    public String getRegistro(Funcionarios e) {
        String registro = e.getId() + SEPARATOR
                + e.getNome() + SEPARATOR
                + e.getCPF() + SEPARATOR
                + e.getSalario() + SEPARATOR
                + e.getIdade() + SEPARATOR;
        return registro;
    }

    public Funcionarios getInstance(String str) {
        StringTokenizer stk = new StringTokenizer(str, SEPARATOR);
        int id = parseInt(stk.nextToken());
        String nome = stk.nextToken();
        int cpf = parseInt(stk.nextToken());
        Funcionarios f1 = new Funcionarios(id, nome, cpf);
        double salario = parseDouble(stk.nextToken());
        f1.setSalario(salario);
        int idade = parseInt(stk.nextToken());
        f1.setIdade(idade);
        return f1;
    }
}