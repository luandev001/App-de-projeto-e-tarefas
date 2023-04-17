/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

/**
 *
 * @author Luan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
//        project.setId(1);
//        project.setName("Projeto teste");
//        project.setDescription("description");
//        projectController.save(project);
       
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setId(3);
        project.setName("Novo nome do projeto 67");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos" + projects.size()); 

        projectController.removeById(3);
        
        TaskController taskController = new TaskController(); 
        
        Task task = new Task();
        task.setName("Criar as telas da aplicação");
        task.setDescription("Devem ser criadas telas para os cadastros");
        task.setNotes("Sem notas");
        task.setIsCompleted(false);
        task.setDeadline(new Date());
        
        taskController.save(task);
        
        task.setName("Alterar telas da aplicação");
        taskController.update(task);
        List<Task> tasks = taskController.getAll(3);
        System.out.println("Total de tarefas = " + tasks.size());
    }
}
