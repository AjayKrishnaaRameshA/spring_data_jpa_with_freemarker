package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

@Controller
public class MainController {

	@Autowired
	private TaskRepository taskRepository;
	
	@RequestMapping("/")
	public String getTasks(Model model) {
		
		/*List<Task> tasks=new ArrayList<>();
		
		tasks.add(new Task(1,1,"1st description",LocalDate.of(2024, 01, 20)));
		tasks.add(new Task(2,1,"2nd description",LocalDate.of(2024, 01, 21)));
		tasks.add(new Task(2,1,"3rd description",LocalDate.of(2024, 01, 22)));
		*/
		
		List<Task> tasks=taskRepository.findAll();
		
		model.addAttribute("tasks", tasks);
		
		return "index";
	}
	
	@RequestMapping("/tasks/{id}")
	public String closeTask(@PathVariable int id) {
		taskRepository.deleteById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/newTask")
	public String getTaskForm() {
		return "task-form";
	}
	
	@PostMapping("/processForm")
	public String addTask(@ModelAttribute Task task){
		taskRepository.save(task);
		return "redirect:/";
	}
	
	@RequestMapping("/sortByPriority")
	public String sortByPriority(Model model) {
		List<Task> tasks=taskRepository.findAllByOrderByPriority();
		model.addAttribute("tasks",tasks);
		return "index";
	}
}
