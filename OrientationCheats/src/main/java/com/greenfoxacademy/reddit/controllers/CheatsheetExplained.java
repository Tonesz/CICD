package com.greenfoxacademy.reddit.controllers;


import com.greenfoxacademy.reddit.services.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//@Component
//@Controller // <- templétet adnak vissza a metódusok
//@RequestMapping("/almappa") // <- így csinálunk almappát
////@RestController // < - azt jeleníti meg a weboldalon amit visszaadunk(objectet), a template helyett
//public class CheatsheetExplained {
//
//
//
////    @RequestMapping <- általános metódus hivás fölé (GET, POST, DELETE, CRUD stb egybe)
//
////    @RequestParam <- bekérünk adatot a weboldalról pl:
//    @RequestMapping("/")
//    public String index(@RequestParam String text) {
//        return "redirect:/" + text; // ugyan ott maradsz, csak vmi funkcioushoz bekérsz adatot és használod
//    }
//    // redirect:/?+(input)
////    @PathVariable // átdob egy másik endpointra, akkor kell ha át akarod tolni másik endpointra
//
////    @ModelAttribute // siman container, bele rakod amit kell (Model model) <- metódus bemenet
//
//    // View
//
//
//
////    @Autowired <- összekapcsoljuk: repot > service
////                                   repot > springApp
////                                   service > controller
////
////    @Qualifier <- segít hogy melyik controllert használjuk
//
////    @Component <- servicen belüli függvények / metódusok, a logika alkotoelemei (modularitás)
//
////    @Service <- a logikája, backendje az alkalmazásunknak!
////    @ComponentScan
//
////    CommandLineRunner <- Spring Appba kell, ettől tudjuk felülírni a run-t
//
//
//    // Servicet "idehozom", összekötöm a controllerrel
//
//    private RedditService redditServiceImpl;
//    private RedditService redditServiceClone;
//
//    // Ez egybe van a constructorral
//
//
//
//
//    // Ne foglalkozz a qualifierrel
//    @Autowired
//    public CheatsheetExplained(@Qualifier("Impl") RedditService redditServiceImpl,
//                               @Qualifier("Clone") RedditService redditServiceClone) {
//        this.redditServiceImpl = redditServiceImpl;
//        this.redditServiceClone = redditServiceClone;
//
//    }
//
//
//    // Fő oldal betöltése: kilistázom a lista összes elemét
//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("list", redditServiceImpl.findAll());
//        return "main";
//    }
//
//
//    // Delete from DB / törlés adatbázisból
//    @GetMapping("/delete/{id}")
//    public String deletePost(@PathVariable(name = "id") Long id){
//        redditServiceImpl.deletePostWithId(id);
//        return "redirect:/";
//    }
//
//
//
//    // Megjelenítem a változásokat, átírányítás / Take me to the submit page
//    @GetMapping("/submit")
//    public String submit(Model model) {
//        return "submit";
//    }
//
//
//    // Csinálok egy új modelt, új elemet, és eltárolom / Create new model and store it
//    @PostMapping("/submit")
//    public String submitNewPost(Model model, @RequestParam String counter, @RequestParam String title) {
//        redditServiceImpl.createPost(Integer.parseInt(counter), title);
//        return "redirect:/";
//    }
//
//
//    // Adot Id alapján +1-et adok a számlálójához
//    @GetMapping("/increase/{id}")
//    public String increaseCount(@PathVariable(name = "id") Long id){
//        redditServiceImpl.updatePostById(id);
//        return "redirect:/";
//    }
//
//
//    // Templete Example > minden html kód ami kelhet vizsgához!
//    @GetMapping("/barna")
//    public String barna() {
//        return "TemplateExample";
//    }
//
//
//
////    @GetMapping("/filter")
////    public String findBirdByName(Model model, @RequestParam(name = "search") String search){
////        model.addAttribute("birds", birdService.findByString(search));
////        return "index";
////    }
////
////    @GetMapping("/flying-jpql")
////    public String findFlyingJPQL(Model model){
////        model.addAttribute("birds", birdService.findFlyingJPQL());
////        return "index";
////    }
////
////    @GetMapping("/flying-native")
////    public String findFlyingNative(Model model){
////        model.addAttribute("birds", birdService.findFlyingNative());
////        return "index";
////    }



//}
