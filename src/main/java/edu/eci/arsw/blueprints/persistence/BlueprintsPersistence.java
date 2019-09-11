/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.persistence;

import edu.eci.arsw.blueprints.model.Blueprint;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author hcadavid
 */
@Service
public interface BlueprintsPersistence {
    
    /**
     * 
     * @param bp the new blueprint
     * @throws BlueprintPersistenceException if a blueprint with the same name already exists,
     *    or any other low-level persistence error occurs.
     */
    public void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException;
    
    /**
     * 
     * @param author blueprint's author
     * @param bprintname blueprint's author
     * @return the blueprint of the given name and author
     * @throws BlueprintNotFoundException if there is no such blueprint
     * @throws AuthorNotFoundException if there is no such author. 
     */
    public Blueprint getBlueprint(String author,String bprintname) throws BlueprintNotFoundException,AuthorNotFoundException;
    
    /**
     * 
     * @param author blueprint's author
     * @return A list of blueprints that belong to the author.  
     * @throws AuthorNotFoundException if there is no such author. 
     */
    public Set<Blueprint> getBlueprintsByAuthor(String author) throws AuthorNotFoundException;
    
    /**
     * 
     * @return A list with all the authors  
     */
    public Set<Blueprint> getAllBlueprints();
       
    /**
     * Este metodo actualiza el blueprint 
     * @param author El autor del blueprint 
     * @param bname El nombre del blueprint 
     * @param blueprint El blueprint nuevo que se desea reemplazar
     */
    public void uptade(String author, String bname, Blueprint blueprint) throws BlueprintNotFoundException;
}
