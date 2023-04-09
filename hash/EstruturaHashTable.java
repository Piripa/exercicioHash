package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int calculo = chave % 1000;
        if(this.tabela[calculo] != null)
        {
            return false;
        }
        else
        {
            this.tabela[calculo] = chave;
            return true;
        }
        
    }

    @Override
    public boolean delete(int chave) {
        int calculo = chave % 1000;
        if(this.tabela[calculo] != null)
        {
    
            this.tabela[calculo] = null;
            return true;
        }
        else
        {
            return false;
        }
        
    }

    @Override
    public boolean search(int chave) {
        int calculo = chave % 1000;
        if(this.tabela[calculo] != null)
        {
            if(this.tabela[calculo] == chave)
            {

                return true;
            }
        }
            return false;
        
    }
    
}
