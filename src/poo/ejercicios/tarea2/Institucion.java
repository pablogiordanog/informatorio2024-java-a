package poo.ejercicios.tarea2;

import poo.ejercicios.tarea2.enumerations.ComplejidadEnum;

import java.time.LocalDate;
import java.util.*;

public class Institucion {
    private List<Curso> cursos = new ArrayList<>();

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Curso crearCurso(){
        Curso nuevoCurso = new Curso();
        Scanner sc = new Scanner(System.in);

        nuevoCurso.setId(UUID.randomUUID());
        System.out.println("Ingrese nombre de curso");
        String nombre = sc.nextLine();
        sc.nextLine();

        System.out.println("Ingrese la complejidad del curso");
        int opcion = 1;
        for(ComplejidadEnum c:ComplejidadEnum.values()){
            System.out.println(opcion + ". " +c.name());
            opcion++;
        }
        int complejidad = sc.nextInt();
        sc.nextLine();

        //switch (complejidad){
        //    case 1:
        //        nuevoCurso.setComplejidad(ComplejidadEnum.ALTA);
        //        break;
        //    case 2:
        //        nuevoCurso.setComplejidad(ComplejidadEnum.MEDIA);
        //        break;
        //    case 3:
        //        nuevoCurso.setComplejidad(ComplejidadEnum.BAJA);
        //        break;
        //    default:
        //        nuevoCurso.setComplejidad(ComplejidadEnum.NINGUNA);
        //        break;
        //}
        //Java 17
        nuevoCurso.setNombre(nombre);
        nuevoCurso.setComplejidad(
                switch (complejidad){
                    case 1 -> ComplejidadEnum.ALTA;
                    case 2 -> ComplejidadEnum.MEDIA;
                    case 3 -> ComplejidadEnum.BAJA;
                    case 4 -> ComplejidadEnum.NINGUNA;
                    default -> null;
                });

        System.out.println("Ingrese cantidad de horas del curso:");
        int horas = sc.nextInt();
        sc.nextLine();
        nuevoCurso.setCantidadHoras(horas);

        if(this.cursos.add(nuevoCurso)){
            System.out.println("Curso creado satisfactoriamente.");
        }



        return nuevoCurso;
    }

    private Estudiante registrarEstudiante(){
        Estudiante estudianteNuevo = new Estudiante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = sc.nextLine();
        sc.nextLine();
        estudianteNuevo.setNombre(nombreEstudiante);

        System.out.println("Ingrese el dni del estudiante:");
        Long dni = sc.nextLong();
        sc.nextLine();
        estudianteNuevo.setDni(dni);

        System.out.println("Ingrese fecha de nacimiento:");
        System.out.println("Ingrese Año:");
        int anio = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese Mes:");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese Día:");
        int dia = sc.nextInt();
        sc.nextLine();

        LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);
        estudianteNuevo.setFechaNacimiento(fechaNacimiento);

        return estudianteNuevo;
    }

    public boolean inscribirEstudiante(UUID idCurso){
        Estudiante estudiante = registrarEstudiante();
        boolean siEstisteCurso = Boolean.FALSE;
        for (Curso curso:this.cursos){
            if(curso.getId().equals(idCurso)){
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(),estudiante);
                siEstisteCurso = Boolean.TRUE;
                break;
            }
        }
        if(siEstisteCurso){
            System.out.println("Estudiante agregado al curso.");
        }
        return siEstisteCurso;
    }

    public void inscribirEstudianteACurso(UUID idCurso, Long dni){
        Estudiante estudiante = null;
        boolean siExisteEstudiante = Boolean.FALSE;
        boolean siExisteCurso = Boolean.FALSE;

        for(Curso curso:this.getCursos()){
            if(curso.getEstudiantes().containsKey(dni)){
                estudiante = curso.getEstudiantes().get(dni);
                siExisteEstudiante = Boolean.TRUE;
                break;
            }
        }

        if(!siExisteEstudiante){
            throw new NoSuchElementException("No existe el estudiante");
        }

        for(Curso curso: this.getCursos()){
            if(curso.getId().equals(idCurso)){
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(), estudiante);
                siExisteCurso = Boolean.TRUE;
                break;
            }
        }

        if(siExisteCurso) {
            System.out.println("Estudiante asignado al curso");
        }else{
            throw new NoSuchElementException("No existe el curso");
        }
    }

    public void listarCursos(){
        System.out.println("Lista de cursos disponibles");
        for(Curso curso:this.getCursos()){
            System.out.println(curso.toString());
        }
    }

    public void listarEstudiantesYCursos(){
        Set<Estudiante> listasEstudiantesSinRepetir = new HashSet<>();
        for(Curso curso:getCursos()){
            //Esto para generar una lista sin estudiantes repetidos
            listasEstudiantesSinRepetir.addAll(curso.getEstudiantes().values());
        }
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>(listasEstudiantesSinRepetir);
        System.out.println("Estudiantes");
        for(Estudiante estudiante:listaEstudiantes){
            System.out.println(estudiante.toString());
            System.out.println("========================================");
            for(Curso cursosEstudiante: estudiante.getCursos()){
                System.out.println(cursosEstudiante.toString());
            }
        }
    }
}


