package model;
import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

public class Planeta{
	
	private String nome;
	private int diametro;
	private int gravidade;
	private ArrayList<Object>[][] objetos;
	private ArrayList<Observer> observers= new ArrayList<>();
	private int tamanho;
	private int posicaoX;
	private int posicaoY;
	 Coordenadas coordenada ;
   public Planeta() {
	   this.setTamanho(20);
   }
   public Planeta(String nome,int diametro,int gravidade,int tamanho) {
	 
	   this.setDiametro(diametro);
	   this.setGravidade(gravidade);
	   this.setObjetos(objetos);
	   this.setNome(nome);
	   this.setTamanho(tamanho);
	   
	   objetos = new ArrayList[tamanho][tamanho];
	   for(int i =0;i<objetos.length;i++) {
		   for(int j=0;j<objetos.length;j++) {
				   objetos[i][j]= new ArrayList<Object>();			  
		   }		   
	   }
	  iniciaRochas();
	  iniciaBaterias();
	  
   }
   public void iniciaRochas() {
	   for(int i=0;i<30;i++) {
		   int j=  new Random().nextInt(20);
		   int l=  new Random().nextInt(20);
		   objetos[j][l].add(new Rocha());
	   }
   }
   public void iniciaBaterias() {
	   for(int i=0;i<10;i++) {
		   int j=  new Random().nextInt(20);
		   int l=  new Random().nextInt(20);
		   objetos[j][l].add(new Bateria());
	   }
   }
   public void iniciaRover(Rover rover) {
	   int j=  new Random().nextInt(20);
	   int l=  new Random().nextInt(20);
	   objetos[j][l].add(rover);
				 
	}
   
//   public void adiciona(Object objeto)
//   {  
//	  this.setPosicaoX( 1 + (int) (Math.random() %20));
//	  this.setPosicaoY( 1 + (int) (Math.random() % 20));
//	   objetos[posicaoX][posicaoY].add(objeto);
//	   this.notificaObserver();
//	   
//   }
  public Object removeObjeto(Object Object,int posicao) {
	  this.buscar(Object).remove(posicao);
	   
	   this.notificaObserver();
	   return Object;
    }
//   public void moveObjeto(Object Object,int direcao) {
//	   ArrayList aux= buscar(Object);
//          direcao=1+ new Random().nextInt(4) ;
//       Object a = null;
//       switch(direcao){
//           case 1: 
//                for(Object o: aux){
//                     if(o.equals(Object)){
//                        a = (Object) aux;
//                         buscar(Object).remove(o);
//                     }
//                }
//                if(this.getPosicaoX()<1) {
//                	objetos[20][this.getPosicaoY()].add(a);
//                }else {
//                objetos[this.getPosicaoX()-1][this.getPosicaoY()].add(a);
//                }
//                this.preencherPlaneta();
//                break;	
//           case 2: 
//               for(Object o: aux){
//                    if(o.equals(Object)){
//                       a = (Object) aux;
//                        buscar(Object).remove(o);
//                    }
//               }
//               if(this.getPosicaoX()>20) {
//            	   objetos[1][this.getPosicaoY()].add(a);
//               }else {
//               objetos[this.getPosicaoX()+1][this.getPosicaoY()].add(a);
//               }
//               this.preencherPlaneta();
//               break;	
//           case 3: 
//               for(Object o: aux){
//                    if(o.equals(Object)){
//                       a = (Object) aux;
//                        buscar(Object).remove(o);
//                    }
//               }
//               if(this.getPosicaoY()>20) {
//            	   objetos[this.getPosicaoX()][1].add(a);
//               }else {
//               objetos[this.getPosicaoX()][this.getPosicaoY()+1].add(a);
//               }
//               this.preencherPlaneta();
//               break;
//           case 4: 
//               for(Object o: aux){
//                    if(o.equals(Object)){
//                       a = (Object) aux;
//                        buscar(Object).remove(o);
//                    }
//               }
//               if(this.getPosicaoY()<1) {
//            	   objetos[this.getPosicaoX()][20].add(a);
//               }else {
//               objetos[this.getPosicaoX()][this.getPosicaoY()-1].add(a);
//               }
//               this.preencherPlaneta();
//               break;
//       }
//       this.notificaObserver();
//   }
   public Coordenadas localizaObjeto(Object object) {
	  ArrayList <Object> aux=buscar(object);
	  for(int i =0;i<objetos.length;i++) {
			for(int j=0;j<objetos.length;j++) {
				for(int k=0;k<objetos[i][j].size();k++) {
					if(objetos[i][j].get(k).equals(object)) {
						return new Coordenadas(i,j);
					}
					
				}
			}
			
		}
		return null;
	  }
	 
	public void  preencherPlaneta(){
		for(int i=0;i< 20;i++)
		{
			for(int j=0; j < 20; j++)
			{
				
					if(objetos[i][j] != null && objetos[i][j].isEmpty()) {
						System.out.print("|__|");
					}else
					System.out.print(" "+objetos[i][j]);
				
				
			}
			System.out.println();
		}
		
	
		}
	

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getDiametro() {
			return diametro;
		}

		public void setDiametro(int diametro) {
			this.diametro = diametro;
		}

		public int getGravidade() {
			return gravidade;
		}

		public void setGravidade(int gravidade) {
			this.gravidade = gravidade;
		}

		public ArrayList<Object>[][] getObjetos() {
			
			return objetos;
		}

		public void setObjetos(ArrayList<Object>[][] objetos) {
			this.objetos = objetos;
		}
		public ArrayList <Object> getObjeto(Object object){
			if(buscar(object)==null) {
				return null;
				
			}else {
				return buscar(object);
			}
		
			
			
		}
		private ArrayList<Object> buscar(Object  object ) {
			for(int i =0;i<objetos.length;i++) {
				for(int j=0;j<objetos.length;j++) {
					for(int k=0;k<objetos[i][j].size();k++) {
						if(objetos[i][j].get(k)==object) {
							return objetos[i][j];
						}
						
					}
				}
				
			}
			return null;
			
		}
		public int getTamanho() {
			return tamanho;
		}
		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}
		public int 	getPosicaoX() {
			return posicaoX;
		}

		public void setPosicaoX(int posicaoX) {
			this.posicaoX = posicaoX;
		}
		public int 	getPosicaoY() {
			return posicaoX;
		}

		public void setPosicaoY(int posicaoY) {
			this.posicaoX = posicaoY;
		}
		
		public void notificaObserver() {
			for(Observer observer: observers) {
				observer.update(null, null);
				
			}
		}
		public void registraObserver(Observer observer) {
			observers.add(observer);
		}
}	
	

	

