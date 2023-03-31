package com.fisttech.finhist.controller;

import com.fisttech.finhist.model.Record;
import com.fisttech.finhist.model.UserInfo;
import com.fisttech.finhist.service.RecordService;
import com.fisttech.finhist.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("v2a")
public class RecordController {

    private RecordService recordService;
    private UserService userService;

    public RecordController(RecordService recordService, UserService userService) {
        this.recordService = recordService;
        this.userService = userService;
    }

//    @GetMapping
//    public String index(){
//        return "index";
//    }

    @PostMapping("/insertTest")
    public String insertTest(/*@Valid */@RequestBody Record record) {
        return recordService.createTest(record);
    }

    //    @RequestMapping(value = "/", method = RequestMethod.POST)
    @PostMapping("/ins")
    public ResponseEntity<?> handleForm(@RequestParam("firstName") String firstName,
                                        @RequestParam("firstName") String lastName,
                                        @RequestParam("role") String role) {


        return ResponseEntity.ok().body(firstName);
    }


//    @GetMapping("")
//    public String createUser(Model model, @ModelAttribute UserInfo userInfo) {
//
//        return "zort";
//    }

    //    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String getUsers(Model model) {
        List<UserInfo> users = userService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("userInfo", new UserInfo());
        return "zort";
    }

    //    @RequestMapping(value = "/", method = RequestMethod.POST)
    @PostMapping("/zort")
    public String zo1(Model model, @ModelAttribute UserInfo userInfo) {
        UserInfo user = userService.createUser(userInfo);
        return "redirect:/ins/zort";
    }

}
