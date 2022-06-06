package com.example.New.Medication.Database.Cindy.Chen.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.New.Medication.Database.Cindy.Chen.Entity.Medication;
import com.example.New.Medication.Database.Cindy.Chen.Service.MedicationService;

@Controller
public class MedicationController {
	@Autowired
	private MedicationService medicationService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    Iterable<Medication> listMedications = medicationService.listAll();
	    model.addAttribute("listMedications", listMedications);
	     
	    return "index";
	}
	@RequestMapping("/new")
	public String showNewMedicationPage(Model model) {
	    Medication medication = new Medication();
	    model.addAttribute("medication", medication);
	     
	    return "new_medication";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMedication(@ModelAttribute("medication") Medication medication) {
	    medicationService.save(medication);
	     
	    return "redirect:/";
	}
	@RequestMapping("/edit/{medicationID}")
	public ModelAndView showEditMedicationPage(@PathVariable(name = "medicationID") int medicationID) {
	    ModelAndView mav = new ModelAndView("edit_medication");
	    Medication medication = medicationService.get(medicationID);
	    mav.addObject("medication", medication);
	     
	    return mav;
	}
	@RequestMapping("/delete/{medicationID}")
	public String deleteMedication(@PathVariable(name = "medicationID") int medicationID) {
		medicationService.delete(medicationID);
	    return "redirect:/";       
	}
	@RequestMapping("/HomePage")
	public String HomePage() {
		return "HomePage";
	}

	@RequestMapping("/Medications")
	public String FirstPage() {
		return "Medications";
	}

	@RequestMapping("/AtorvastatinPage")
	public String AtorvastatinPage() {
		return "AtorvastatinPage";
	}

	@RequestMapping("/AmoxicillinPage")
	public String AmoxicillinPage() {
		return "AmoxicillinPage";
	}

	@RequestMapping("/LisinoprilPage")
	public String LisinoprilPage() {
		return "LisinoprilPage";
	}

	@RequestMapping("/LevothyroxinePage")
	public String LevothyroxinePage() {
		return "LevothyroxinePage";
	}

	@RequestMapping("/AlbuterolPage")
	public String AlbuterolPage() {
		return "AlbuterolPage";
	}

	@RequestMapping("/MetforminPage")
	public String MetforminPage() {
		return "MetforminPage";
	}

	@RequestMapping("/AmlodipinePage")
	public String AmlodipinePage() {
		return "AmlodipinePage";
	}

	@RequestMapping("/MetoprololPage")
	public String MetoprololPage() {
		return "MetoprololPage";
	}

	@RequestMapping("/OmeprazolePage")
	public String OmeprazolePage() {
		return "OmeprazolePage";
	}

	@RequestMapping("/LosartanPage")
	public String LosartanPage() {
		return "LosartanPage";
	}

	@RequestMapping("/AzithromycinPage")
	public String AzithromycinPage() {
		return "AzithromycinPage";
	}

	@RequestMapping("/PrednisonePage")
	public String PrednisonePage() {
		return "PrednisonePage";
	}

	@RequestMapping("/IbuprofenPage")
	public String IbuprofenPage() {
		return "IbuprofenPage";
	}

	@RequestMapping("/HydrocodoneAndAcetaminophenPage")
	public String HydrocodoneAndAcetaminophenPage() {
		return "HydrocodoneAndAcetaminophenPage";
	}

	@RequestMapping("/GabapentinPage")
	public String GabapentinPage() {
		return "GabapentinPage";
	}

	@RequestMapping("/InnerPage")
	public String InnerPage() {
		return "InnerPage";
	}

	@RequestMapping("/AboutPage")
	public String AboutPage() {
		return "AboutPage";
	}

	@RequestMapping("/AddMedicationFormPage")
	public String AddMedicationFormPage() {
		return "AddMedicationForm";
	}
	@RequestMapping("/index")
	public String showIndexPage() {
		return "redirect:/";
	}
}


