import java.lang.*;
import java.util.*;

class segmentacion{
	public static void main(String[]jajasies){
		//Inicio
		String[] developer = new String[4];
		developer[0]="*****************";
		developer[1]="Peter Perez";
		developer[2]="Birobytes";
		developer[3]="*****************";
		String r;
		System.out.println("Bienvenido al Programa de Procesos de Memoria");
		System.out.println(" ");
		System.out.println("Developed by: ");
		for(int i=0; i<4; i++){
		System.out.println(developer[i]);
											}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Programa Segmentacion de Memoria");
		System.out.println("Presiona enter para continuar");
		Scanner f = new Scanner(System.in);
		r= f.nextLine();
		
		
		//Creaci�n de objetos (Procesos) Slots de procesos
		Memoria Proceso1 = new Memoria(1, 200 ,"Vacio");
		Memoria Proceso2 = new Memoria(2, 500 ,"Vacio");
		Memoria Proceso3 = new Memoria(3, 600 ,"Vacio");
		Memoria Proceso4 = new Memoria(4, 100 ,"Vacio");
		Memoria Proceso5 = new Memoria(5, 150 ,"Vacio");
		Memoria Proceso6 = new Memoria(6, 300 ,"Vacio");
		
		//Uso de m�todo
		Proceso1.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso2.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso3.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso4.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso5.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso6.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso1.Consultarmemoria();
		System.out.println (" ");
		r= f.nextLine();
		Proceso1.iniciarproceso(100, "Internet Explorer.exe");
		Proceso1.Consultarmemoria();
		Proceso1.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso2.Consultarmemoria();
		System.out.println (" ");
		Proceso2.iniciarproceso(600, "LimeWare.exe");
		Proceso2.Consultarmemoria();
		Proceso2.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso3.Consultarmemoria();
		System.out.println (" ");
		Proceso3.iniciarproceso(600, "LimeWare.exe");
		Proceso3.Consultarmemoria();
		Proceso3.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso2.Consultarmemoria();
		System.out.println (" ");
		Proceso2.iniciarproceso(400, "Ares.exe");
		Proceso2.Consultarmemoria();
		Proceso2.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso4.Consultarmemoria();
		System.out.println (" ");
		Proceso4.iniciarproceso(80, "Microsoft Office Word 2007.exe");
		Proceso4.Consultarmemoria();
		Proceso4.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso5.Consultarmemoria();
		System.out.println (" ");
		Proceso5.iniciarproceso(450, "UTorrent.exe");
		Proceso5.Consultarmemoria();
		Proceso5.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso6.Consultarmemoria();
		System.out.println (" ");
		Proceso6.iniciarproceso(450, "UTorrent.exe");
		Proceso6.Consultarmemoria();
		Proceso6.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		Proceso5.Consultarmemoria();
		System.out.println (" ");
		Proceso5.iniciarproceso(115, "MSInstaller.exe");
		Proceso5.Consultarmemoria();
		Proceso5.fragmentacionex();
		System.out.println(" ");
		r= f.nextLine();
		int fraget=Proceso1.fragmento()+Proceso2.fragmento()+Proceso3.fragmento()+Proceso4.fragmento()+Proceso5.fragmento()+Proceso6.fragmento();
		Proceso6.compactacion(fraget);
		r= f.nextLine();
		Proceso6.Consultarmemoria();
		System.out.println (" ");
		Proceso6.iniciarproceso(450, "UTorrent");
		Proceso6.Consultarmemoria();
		Proceso6.fragmentacionex();
		System.out.println(" ");
		
		Proceso1.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso2.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso3.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso4.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso5.mostrarmemoria();
		System.out.println(" ");
		r= f.nextLine();
		Proceso6.mostrarmemoria();
		r= f.nextLine();
		int residuo=+Proceso6.fragmento();
		System.out.println(" ");
		System.out.println("FRAGMENTACION TOTAL: " + (fraget+residuo));
		System.out.println("");
		System.out.println("*********************************************************************************************************");
		r= f.nextLine();
		System.out.println("fin de programa");
		f.close();
			}
		}
		
	//Clase II
	class Memoria{
	//Atributos
	public int fraget, espaciofinal, espacio, error, compactacion, compac;
	private int numeromem;
	private String contenido;
	private float porcentaje=0.0f, tamano=0.0f;
	
	//Declara el segmento de Memoria para el proceso entrante
	public Memoria(int numeromem, int espacio, String contenido){
		this.numeromem=numeromem;
		this.espacio=espacio;
		this.contenido=contenido;
					}
					
			//Metodo Consulta de Memoria usada por segmentos
	public void Consultarmemoria() {
		if(this.contenido=="Vacio"){
		System.out.println("............................................................");
		System.out.println("Segmento numero " + this.numeromem + ":" + this.espacio);
		System.out.println ("Espacio restante: "+this.espacio + " de " + espacio);
		System.out.println("............................................................");
	}else{
		System.out.println("............................................................");
		System.out.println("Segmento numero " + this.numeromem + ":" + this.espaciofinal);
		System.out.println ("Espacio restante: "+this.espaciofinal + " de " + espacio);
		System.out.println("............................................................");
				}
			}
			
			//Metodo de Consulta de espacio
	public void fragmentacionex() {
		System.out.println ("Memoria desperdiciada   : "+this.espaciofinal);
			}
			
			//Fragmentacion
			public int fragmento() {
			int fragmento=this.espaciofinal;
			return(fragmento);
			}
			
			//Metodo de Mostrar memoria
		public void mostrarmemoria() {
		this.numeromem=numeromem;
		this.espaciofinal=espaciofinal;
		this.espacio=espacio;
		System.out.println("---------------------------------------------------------");
		System.out.println(" ");
		System.out.println ("Segmento de memoria numero: " + numeromem);
		System.out.println("Espacio asignado: " + espacio);
		System.out.println("Procesos: " + this.contenido);
		System.out.println("Fragmentacion externa: " + espaciofinal);
		System.out.println(" ");
		System.out.println("---------------------------------------------------------");
			}
			
		
			//Metodo de	Desplegar fragmentacion externa total	
		public void fragmentaciontotal(){
				System.out.println("Fragmentacion externa total: " + fraget);		
					}
				
			//Metodo de inicio de proceso
		public void iniciarproceso(int tamano, String proceso){
			if(espacio>=tamano){
			System.out.println("Iniciando proceso " + proceso + "(" + tamano + ")" + " en segmento " + numeromem + "(" + espacio + ")");
			this.tamano=tamano;
			this.espaciofinal=(espacio-tamano);
			this.contenido=proceso;
			contenido=proceso;
		} else { //Excepcion
		System.out.println("Error al intentar procesar " + proceso + " INSUFICIENTE ESPACIO " + "(" + tamano + ")" + " necesarios, solo existen " + espacio);
		System.out.println("Deteniendo ejecucion.");
		this.contenido="Vacio";
				} 
					}
				
			//Metodo de Asignar numero de memoria (slot)
    public void asignarnum(int numeromem){
    	this.numeromem=numeromem;
    	System.out.println("Asignando numero de Memoria como: " + numeromem);
    }//fin de metodo
    
			//Metodo de Asignar capacidad de memoria
    public void asignarcapacidad(int espacio){
    	this.espacio=espacio;
    	this.espaciofinal=espacio;
    	System.out.println("Asignando capacidad de memoria " + numeromem + " como: " + espacio);
    }
    		//Metodo de Compactacion
    public int compactacion(int compactacion){
    	this.numeromem=numeromem;
    	this.espacio=espacio;
    	this.compactacion=compactacion;
    	System.out.println("");
    	System.out.println("*********************************************************************************************************");
    	System.out.println("");
    	System.out.println("Iniciando compactacion de segmento: " + numeromem + " con " + espacio + " aumentandole " + compactacion);
    	this.espacio=(this.espacio+this.compactacion);
    	compactacion=(compac+espacio);
    	System.out.println("FINAL: " + this.espacio);
		System.out.println("");
		System.out.println("*********************************************************************************************************");
		System.out.println("");
    	return(compactacion);
    }//fin de metodo    
    
    
		}//fin de clase