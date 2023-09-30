import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] canvas = new String[20][40]; // tamanio del lienzo

        // iniciar el lienzo con espacio blanco
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = "";
            }
        }
        while (true) {
            System.out.println("menu");
            System.out.println("1- agregar linea");
            System.out.println("2- hacer una circuferencia");
            System.out.println("3- cambiar color");
            System.out.println("4- anillos en capa");
            System.out.println("5- borrar todo");
            System.out.println("6- insertar texto");
            System.out.println("7- crear una circuferencia pintada");
            System.out.println("8- crear un ACPIA");
            System.out.println("9- circuferencia con una linea");
            System.out.println("0- salir");

            System.out.println("elige una opcion");
            int opcion = scanner.nextInt();
            String currentColor = "white"; // color del lienzo actual
            switch (opcion) {
                case 1:
                    // opcion 1 agragar linea
                    System.out.println("ingrese cordenadas(x1,y1) (x2,y2): ");
                    int x1 = scanner.nextInt();
                    int y1 = scanner.nextInt();
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    Object Drawline;
                    drawLine(canvas,x1,y1,x2,y2,currentColor);
                    break;
                case 2:
                    System.out.println("ingrese las cordenadas del centro (x,y): ");
                    int centroX = scanner.nextInt();
                    int centroY = scanner.nextInt();
                    System.out.println("ingrese el radio: ");
                    int radio = scanner.nextInt();
                    drawCircle(canvas, centroX,centroY,radio, currentColor);
                case 3:
                    System.out.println("colores disponible: black,white,red,blue,green,yellow");
                    System.out.println("seleccione un color");
                    currentColor = scanner.nextLine().toUpperCase();
                    break;
                case 4:
                    System.out.println("ingrese la cordenada del centro (x,y): ");
                    int centroAnilloX = scanner.nextInt();
                    int centroAnilloY = scanner.nextInt();
                    System.out.println("ingrese el radio de la circuferencia externa: ");
                    int radioExterno = scanner.nextInt();
                    drawRing(canvas,centroAnilloX,centroAnilloY,radioExterno,currentColor);
                    System.out.println("ingrese el valor de reduccion del radio para la circuferencia");
                    int reduccion = scanner.nextInt();
                    drawcircle(canvas,centroAnilloX,centroAnilloY,radioExterno,reduccion,currentColor);
                    break;
                case 5:
                    clearCanvas(canvas);
                    break;
                case 6:
                    System.out.println("ingrese el texto");
                    String texto = scanner.nextLine();
                    System.out.println("ingrese la cordenadas(x,y)");
                    int textoX = scanner.nextInt();
                    int textoY = scanner.nextInt();
                    drawText(canvas,textoX,textoY);
                    break;
                case 7:
                    System.out.println("ingrese la coordenadas del centro (x,y):");
                    int circuloRellenoX = scanner.nextInt();
                    int circuloRellenoY = scanner.nextInt();
                    System.out.println("inserte el radio");
                    int circuloRellenoRadio = scanner.nextInt();
                    drawFilledCircle(canvas,circuloRellenoX,circuloRellenoY,circuloRellenoRadio,currentColor);
                    break;
                case 8:
                    System.out.println("ingrese la coordenada del centro (x,y)");
                    int centroAcpiaX = scanner.nextInt();
                    int centroAcpiaY = scanner.nextInt();
                    System.out.println("ingrese el radio de la circuferencia externa");
                    int radioAcpiaExterno = scanner.nextInt();
                    drawCircle(canvas,centroAcpiaX,centroAcpiaY,radioAcpiaExterno,currentColor);

                    System.out.println("ingrese el valor de reduccion del radio para las circuferencia ext.");
                    int acpiaReduccion = scanner.nextInt();
                    drawACPIA(canvas,centroAcpiaX,centroAcpiaY,radioAcpiaExterno,acpiaReduccion);
                    break;
                case 9:
                    clearCanvas(canvas);
                    System.out.print("Ingrese las coordenadas del centro (x y): ");
                    int circuloAnimadoX = scanner.nextInt();
                    int circuloAnimadoY = scanner.nextInt();
                    System.out.print("Ingrese el radio de la circunferencia: ");
                    int radioCirculoAnimado = scanner.nextInt();
                    System.out.print("Ingrese las coordenadas del punto final de la línea (x y): ");
                    int lineaFinalAnimadaX = scanner.nextInt();
                    int lineaFinalAnimadaY = scanner.nextInt();
                    drawAnimatedCircleWithLine(canvas, circuloAnimadoX, circuloAnimadoY, radioCirculoAnimado,
                            lineaFinalAnimadaX, lineaFinalAnimadaY, currentColor);
                    break;
                case 0:
                    System.out.println("adios");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("opcion no valida");

            }
        }
    }




    // implementar las funciones
    private static void drawLine (String[][] canvas,int x1,int y1,int x2,int y2, String color ){

    }
    private static void drawCircle(String[][] canvas, int centroX,int centroY,int radio,String color){

    }
    private static void drawRing(String[][] canvas, int centroX, int centroY, int radioExterno,
                                 String color){

    }
    private static void clearCanvas(String[][] canvas){

    }
    private static void drawText(String[][] canvas, int x, int y ){

    }
    private static void drawFilledCircle(String[][] canvas,int centroX,int centroY,int radio,String color){

    }
    private static void drawACPIA(String[][] canvas,int centroX,int centroY,int radioExterno,int reduccion){

    }
    private static void drawAnimatedCircleWithLine(String[][] canvas,
                                                   int circuloAnimadoX,
                                                   int circuloAnimadoY,
                                                   int radioCirculoAnimado,
                                                   int lineaFinalAnimadaX,
                                                   int lineaFinalAnimadaY,
                                                   String currentColor) {
    }
    private static void drawcircle(String[][] canvas,
                                   int centroAnilloX,
                                   int centroAnilloY,
                                   int radioExterno, int reduccion, String currentColor) {
    }


}


