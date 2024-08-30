package linkedList;

public class DLinkedList {

    protected DNode header;    /*Sentinela - cabecalho*/
    protected DNode trailer;    /*Sentinela - nodo final*/
    protected int size;              /*tamanho da Lista*/

    /**Construtor padrao que cria uma lista vazia*/
    public DLinkedList()
    {
        header = new DNode(null,null,null);
        trailer = new DNode(null,null,null);
        header.setNext(trailer);
        size = 0;
    } 
    public void addFirst(DNode no){

        DNode w;

         w = header.getNext();  /*aponta para o primeiro elemento da Lista*/
         no.setNext(w);         /*atribui o endereco para o primeiro elemento */
         no.setPrev(header);   /*atribui o endereco da sentinela header*/
         w.setPrev(no);           /*aponta para o no antigo*/
         header.setNext(no);
         size = size + 1;       
 }
    public int size(){   /*tamanho da lista*/
        return size;
  }

  public boolean isEmpty(){ /*a lista esta vazia??*/
         return (size == 0);
  }

  /*Retorna o primeiro da lista*/
  public DNode getFirst()throws IllegalStateException{
         if(isEmpty())
              throw new IllegalStateException("Lista Vazia");
          return header.getNext();
  }

      /*Retorna o ultimo da lista*/
  public DNode getLast() throws IllegalStateException{
          if(isEmpty())
              throw new IllegalStateException("Lista Vazia");
          return trailer.getPrev();
  }
  /*Retorna o no anterior do no dado*/

  public DNode getPrev(DNode no) throws IllegalArgumentException{
      if(no==header)
          throw new IllegalArgumentException("Não há nó anterior");
      return no.getPrev();
  }

  /*Retorna o no sucessor do no dado*/
  public DNode getNext(DNode no) throws IllegalArgumentException{
      if(no==trailer)
          throw new IllegalArgumentException("Não há nó posterior");
      return no.getNext();
  }
  /*Insere um dado nó antes de um dado v*/
  public void addAntes(DNode v, DNode no) throws IllegalArgumentException{
      DNode u = getPrev(v);
      no.setPrev(u);
      no.setNext(v);
      v.setPrev(no);
      u.setNext(no);
      size++;
  }
  /*Insere um dado nó depois de um nó "v"*/
  public void addAfter(DNode v, DNode no) throws IllegalArgumentException{
      DNode u = getNext(v);
      no.setPrev(v);
      no.setNext(u);
      v.setNext(no);
      u.setPrev(no);
      size++;
  }
  public void addLast(DNode no){  /*Insere um nó fornecido no fim da lista*/
      addAntes(trailer,no);
}
/*Remove um determinado nó "no" da lista*/
  public void removeNo(DNode no) throws IllegalArgumentException{
      DNode u = getPrev(no);
      DNode w = getNext(no);
      u.setNext(w);
      w.setPrev(u);
      no.setNext(null);
      no.setPrev(null);
      size--;
  }
  /* Indica se o nó possui antecessor*/
  public boolean temAnt(DNode no){
      return (no!=header);
  }
  /* Indica se o nó possui sucessor*/
  public boolean temSuc(DNode no){
      return (no!=trailer);
  }
  public String toString(){
      DNode ponteiro = header.getNext();
      String s = "{";
      int i = 1;
          while(ponteiro.getNext()!=null){
              if(i==1)
                  s+="[.]-> ";
              s+=" <- ";
              s+=ponteiro.getElement();
              s+=" -> ";
              i++;
              ponteiro = ponteiro.getNext();
          }
      return s+="<-[.]}";
  }


}
