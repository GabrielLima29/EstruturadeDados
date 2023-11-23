
/**
 *
 * @author 0031432312028
 */
public class ListaEncadeada {
    IntNoSimples primeiro, ultimo;
    int numero_nos = 0;
    
    ListaEncadeada(){
        primeiro = ultimo = null;
    }
    
    void InsereNo_inicio (IntNoSimples novoNo){
        novoNo.prox = primeiro;
        if(primeiro == null && ultimo == null){
            ultimo = novoNo;
        }
        primeiro = novoNo;
        numero_nos++;
    }
    
    void InsereNo_fim (IntNoSimples novoNo){
        novoNo.prox = null;
        if(primeiro == null){
          primeiro = novoNo;
        if(ultimo != null)
        ultimo.prox = novoNo;
        numero_nos++;
    }
    }        
    void insereNo_posicao(IntNoSimples novoNo, int posicao){
        IntNoSimples temp_no = primeiro;
        int numero_nos = ContarNos();
        int pos_aux;
        
        if(posicao == 0){
            novoNo.prox = primeiro;
            if (primeiro == ultimo){
                ultimo = novoNo;
            }
            primeiro = novoNo;
        }
        else{
            if(posicao > numero_nos){
                ultimo.prox = novoNo;
                ultimo = novoNo;
            }
        }
    }
} 
