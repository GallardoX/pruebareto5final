/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Game;

/**
 *
 * @author USUARIO
 */
public interface InterfaceGame extends CrudRepository<Game,Integer> {
    
}
