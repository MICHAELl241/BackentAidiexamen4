package MMAURI.MMAURI.Service.impl;

import MMAURI.MMAURI.Dao.IAsignaturaDao;
import MMAURI.MMAURI.Entity.Asignatura;
import MMAURI.MMAURI.Service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AsignaturaServiceImpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDAO;


    @Override
    public List<Asignatura> listaAsignaturas() {
        List<Asignatura> asignaturaList = this.asignaturaDAO.findAll();

        for (Asignatura asignatura: asignaturaList){
            System.out.println(asignatura.toString());
        }
        return asignaturaList;
    }

    @Override
    public Asignatura obtenerPorDenominacionOrSigla(String denoSig) {
        return this.asignaturaDAO.obtenerPorDenominacionOrSigla(denoSig);
    }

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return this.asignaturaDAO.save(asignatura);
    }
}
