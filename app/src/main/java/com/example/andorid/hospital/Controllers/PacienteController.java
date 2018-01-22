package com.example.andorid.hospital.Controllers;

import com.example.andorid.hospital.DAO.HospitalDAO;
import com.example.andorid.hospital.DAO.PacienteDAO;
import com.example.andorid.hospital.Paciente;
import com.example.andorid.hospital.UI.ParientePaciente;
import com.example.andorid.hospital.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by sergiomerayo on 16/1/18.
 */

public class PacienteController {
    private int idPaciente;
    private final PacienteDAO pacienteDAO = new PacienteDAO();
    private final HospitalDAO hospitalDAO = new HospitalDAO();

    //De esto no estoy segura
  /*  public PacienteController(int id){
      idPaciente = id;
    }*/
    public ArrayList<String> getInformacion(){
        //hacer llamada a DAO
        ArrayList<String> s = new ArrayList<String>();
        return s;
    }

    public ArrayList<String> getMedicacionPaciente(){
        //hacer llamada a DAO
        ArrayList<String> s = new ArrayList<String>();
        return s;
    }
    public void gestionarMedicacion(){
        //no se si hace falta, crea el controller de medicacion, llama a la factoria de medicacion

    }
    public void addPaciente(ArrayList<String> info)throws Exception{
        Paciente paciente = crearPaciente(info);
        int habitacion = habitacionLibre();
        paciente.setHabitacionID(habitacion);
        pacienteDAO.addPaciente(paciente);


        //settes con toda la informacion
        //llamada a PacienteDAO para añadirlo
    }

    public void eliminarPaciente(int idPaciente){
        //lamada al dao para eliminar el paciente, se le pasa como parametro idPaciente
        pacienteDAO.eliminarPaciente(idPaciente);

    }

    public ArrayList<String> descomponer(String al){
        String aux = "";
        ArrayList<String> array = new ArrayList<>();

        for(int i=0;i<al.length();i++){
            if(al.charAt(i)!= ';'){
                aux = aux + al.charAt(i);

            }else{
                array.add(aux);
                aux = "";
            }
        }
        return array;
    }

    public Paciente crearPaciente(ArrayList<String> info)throws Exception{
        Paciente paciente = new Paciente();
        paciente.setNombre(info.get(0));
        System.out.println(info.get(0));

        paciente.setApellidos(info.get(1));
        paciente.setDNI(info.get(2));
        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd");
        String date = info.get(3);
        System.out.println(date);
        Date d = sdf.parse(date);
        paciente.setFechaNacimiento(date);
        paciente.setPassword(info.get(4));

        paciente.setPlanta(Usuario.getInstance().getnPlanta());
        paciente.setAlergias(descomponer(info.get(5)));
        paciente.setIntervenciones(descomponer(info.get(6)));
        paciente.setNecesidadesVH(descomponer(info.get(7)));

        paciente.sethToxicosPresentes(descomponer(info.get(9)));
        paciente.sethToxicosPasados(descomponer(info.get(8)));
        paciente.setAntecedentes(descomponer(info.get(10)));
        paciente.setParientePaciente(descomponer(info.get(11)));

        return paciente;
    }
    public int habitacionLibre()throws Exception{
       int nHabitacion = hospitalDAO.getHabitacionLibre(Usuario.getInstance().getnPlanta());
       //  int nHabitacion = hospitalDAO.getHabitacionLibre(1);
        System.out.println("HABITACION "+nHabitacion);
        return nHabitacion;
    }

    public Paciente getPaciente(int idPaciente) throws ExecutionException, InterruptedException {
        return pacienteDAO.getPaciente(idPaciente);
    }

    public ArrayList<Paciente> getlistaPacientes() throws ExecutionException, InterruptedException {
        return pacienteDAO.getLista();
    }
    public ArrayList<Paciente> getlistaPacientesPorPlanta(int p) throws ExecutionException, InterruptedException {
        return pacienteDAO.getListaPacientesPlanta(p);
    }


}
