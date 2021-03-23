package PracticaRecuperacion;

public class TestBasicos {

    public static void main(String []args)
    {
        pruebaClaseCancion();
         pruebaClaseDisco();
        pruebaClasePlayList();
         pruebaClasePlayMusic();

    }

    public static void pruebaClaseCancion()
    {
        System.out.println("Prueba Clase PracticaRecuperacion.Cancion: \n");
        Cancion cancion = new Cancion("Blinding Lights",9.32f);
        System.out.println("esta cancion se llama:" + " " + cancion.getTitulo() +" " + "y dura:" + " " + cancion.getDuracion() +" " + "minutos");
        cancion.setDuracion(10.f);
        System.out.println("nueva duracion: " + cancion.getDuracion());
        cancion.setTitulo("titulo2");
        System.out.println("Nuevo titulo: " + cancion.getTitulo());
        System.out.println("\n ");
    }

    public static void pruebaClaseDisco()
    {
        System.out.println("Prueba Clase PracticaRecuperacion.Disco: \n");
        Disco disco = new Disco("Wings","poo");
        Cancion cancion = new Cancion("dos2",21.2f);
        Cancion cancion2 = new Cancion("How You Like That",13.2f);
        try {
            disco.anadirCancion(cancion);
            disco.anadirCancion(cancion2);
            disco.anadirCancion(cancion);
        } catch (CancionRepetidaException e )
        {
            System.out.println("PracticaRecuperacion.Cancion ya incorporada en el disco: " + e.getCancion().getTitulo());
        }

        disco.getCanciones().getFirst().getTitulo();
        System.out.println("nombreDisco: "+disco.getNombreDisco() + "\n" +"nombreGrupo: " + disco.getNombreGrupo() );
        for(int i = 0; i < disco.getCanciones().size();i++)
        {
            int j = i +1;
            System.out.println("PracticaRecuperacion.Cancion"+j+": " + disco.getCanciones().get(i).getTitulo());
        }
        System.out.println("\n ");
    }

    public static void pruebaClasePlayList()
    {
        System.out.println("Prueba Clase PracticaRecuperacion.PlayList: \n");

        PlayList playList = new PlayList();
        Cancion cancion = new Cancion("Wake Up",2.23f);
        Cancion cancion2 = new Cancion("20",13.2f);
        Cancion cancion3 = new Cancion("Innuendo",32.1f);
        try {
            playList.anadirCancion(cancion);
            playList.anadirCancion(cancion2);
            playList.anadirCancion(cancion3);
        } catch(CancionRepetidaException e )
        {
            System.out.println("PracticaRecuperacion.Cancion Repetida: "+e.getCancion());
        }
        for(int i = 0; i < playList.getCanciones().size();i++)
        {
            int j = i +1;
            System.out.println("PracticaRecuperacion.Cancion"+j+": "+playList.getCanciones().get(i).getTitulo());
        }
        System.out.println("\n ");
    }

    public static void pruebaClasePlayMusic()
    {
        System.out.println("Prueba Clase PracticaRecuperacion.PlayMusic: \n");

        PlayMusic playMusic = new PlayMusic();
        PlayList playList = new PlayList();
        PlayList playList2 = new PlayList();
        Cancion cancion = new Cancion("Jazz",2.23f);
        Cancion cancion2 = new Cancion("veinte",13.2f);
        Cancion cancion3 = new Cancion("Let it be",32.1f);
        try {
            playList.anadirCancion(cancion);
            playList.anadirCancion(cancion3);

            playList2.anadirCancion(cancion);
            playList2.anadirCancion(cancion2);

            playMusic.anadirPlayList(playList);
            playMusic.anadirPlayList(playList2);
            playMusic.anadirPlayList(playList);
        }catch(CancionRepetidaException e )
        {
            System.out.println("PracticaRecuperacion.Cancion Repetida: " + e.getCancion());
        }catch(PlayListRepetida e )
        {
            System.out.println("PracticaRecuperacion.PlayList repetida: " + e.getPlayList());
        } finally {
            for(int j = 0; j <playMusic.getPlayLists().size();j++){
                int y = j+1;
                System.out.println("PracticaRecuperacion.PlayList: "+y);
            for(int i = 0; i < playMusic.getPlayLists().get(j).getCanciones().size();i++)
            {
                int x = i +1;
                System.out.println("PracticaRecuperacion.Cancion"+x+": "+playMusic.getPlayLists().get(j).getCanciones().get(i).getTitulo());
            }
            }
            System.out.println("\n ");
        }



    }
}

