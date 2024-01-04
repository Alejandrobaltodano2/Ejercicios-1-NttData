package Ejercicio_4;


import java.sql.Statement;
import java.util.*;

public class EjercicioMain {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int numero ;
        System.out.println("Ingrese cuantos elementos desea en las 2 listas");
        numero   =scaner.nextInt();
        List<Serie> serieList  = setSeries(numero,scaner);
        List<Videojuego> videojuegosList = setVideojuegos(numero,scaner);
        Map<String,Integer> Entrega = Contador(scaner,serieList,videojuegosList);
        int contadorSerie = Entrega.get("Series");
        int contadorVideojuegos = Entrega.get("Videojuegos");
        System.out.println("Se contaron "+contadorSerie + " de series"+"\n Se contaron "+ contadorVideojuegos+"De videojuegos\n");
        Map<String , Object> aux  = Mayor(serieList,videojuegosList);
        Serie serie = (Serie) aux.get("Serie");
        Videojuego videojuego =(Videojuego) aux.get("videojuego");
        System.out.println("El  serie que tiene mayor temporada es -> "+serie.toString()+"\n\n"+
                            "La pelicula que tiene mayores Horas es -> "+videojuego.toString()

                            );
    }

    private static Map<String, Integer> Contador(Scanner scaner, List<Serie> serieList, List<Videojuego> videojuegoList)
    {
        Map<String,Integer> ContadorSeriesyVideojuegos = new HashMap<>();
        int ContadorSeries  =0;
        int ContadorVideojuegos =0;
        boolean salir = false;
        String respuesta ;
        do {
            String aux;
            for (Serie s: serieList)
            {
                System.out.println(s.toString());
                System.out.println("Desea la serie? S or N ");
                aux  = scaner.next();
                if(aux.toUpperCase().equals("S")) ContadorSeries++;
            }

            System.out.println("Desea mas Series ?  S or N");
            respuesta = scaner.next();
            if(respuesta.toUpperCase().equals("S")) salir = true;
        }while(salir);
        respuesta="";
        salir = false;

        do {
            String aux ;
            for (Videojuego v: videojuegoList)
            {
                System.out.println(v.toString());
                System.out.printf("Desea el videojuego? S or N");
                aux  = scaner.next();
                if(aux.toUpperCase().equals("S")) ContadorVideojuegos++;
            }
            System.out.println("Desea mas series?: S or N");
            respuesta = scaner.next();
            if(respuesta.toUpperCase().equals("S")) salir = true;

        }while (salir);


        ContadorSeriesyVideojuegos.put("Series",ContadorSeries);
        ContadorSeriesyVideojuegos.put("Videojuegos",ContadorVideojuegos);
        return ContadorSeriesyVideojuegos;
    }
    private static Map<String , Object> Mayor( List<Serie> serieList, List<Videojuego> videojuegoList)
    {
        Map<String,Object> aux = new HashMap<>();
        Serie serie = new Serie()  ;
        Videojuego videojuego = new Videojuego()  ;
        int maximaHoraSerie = -1;
        int maximaHoraVideojuego = -1;
        for (Serie s : serieList)
        {
            if(s.getNumeroTemporadas()>maximaHoraSerie)
            {
                maximaHoraSerie = s.getNumeroTemporadas();
                serie = s;
            }
        }
        for(Videojuego v: videojuegoList)
        {
            if(v.getHoras()>maximaHoraVideojuego)
            {
                maximaHoraVideojuego = v.getHoras();
                videojuego = v ;
            }
        }
        aux.put("Serie",serie);
        aux.put("videojuego",videojuego);
        return aux ;

    }
    private static List<Serie> setSeries(int numero,Scanner scaner)
    {
        List<Serie> serieList  = new ArrayList<>();

        for (int i =0;i<numero;i++)
        {
            Serie serie = new Serie();
            System.out.println("Ingrese el titulo de la serie ");
            serie.setTitulo(scaner.next());
            System.out.println("Ingrese el numero de temporadas");
            serie.setNumeroTemporadas(scaner.nextInt());
            System.out.println("Ingrese el genero ");
            serie.setGenero(scaner.next());
            System.out.println("Ingrese el creador: ");
            serie.setCreador(scaner.next());
            serieList.add(serie);

        }
        return serieList;
    }

    private static List<Videojuego> setVideojuegos(int numero,Scanner scaner)
    {
        List<Videojuego> videojuegosList = new ArrayList<>();
        for (int i =0 ; i<numero ; i++ )
        {
            Videojuego videojuego = new Videojuego();
            System.out.println("Ingrese el titulo del videojuego: ");
            videojuego.setTitulo(scaner.next());
            System.out.println("Ingrese las horas: ");
            videojuego.setHoras(scaner.nextInt());
            System.out.println("Ingrese el genero: ");
            videojuego.setGenero(scaner.next());
            System.out.println("Ingrese la compañia: " );
            videojuego.setCompania(scaner.next());
            videojuegosList.add(videojuego);
        }
        return videojuegosList;
    }

}