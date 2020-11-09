package oit.is.z0469.kaizi.janken.controller;
import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0469.kaizi.janken.model.Entry;
import oit.is.z0469.kaizi.janken.model.User;
import oit.is.z0469.kaizi.janken.model.UserMapper;
import oit.is.z0469.kaizi.janken.model.Match;
import oit.is.z0469.kaizi.janken.model.MatchMapper;


@Controller
public class Lec02Controller{

  /**@Autowired
  private Entry room;

  @GetMapping("/lec02")
  public String lec02(Principal prin, ModelMap model){
    String loginUser = prin.getName();
    model.addAttribute("login_user", loginUser);
    this.room.addUser(loginUser);
    model.addAttribute("new_room", this.room);
    return "lec02.html";
  }*/

  /**@PostMapping("/lec021")
  public String lec021(@RequestParam String namae, ModelMap model) {
    model.addAttribute("namae", namae);
    return "lec02.html";
  }*/

  @Autowired
  UserMapper userMapper;
  @Autowired
  MatchMapper matchMapper;

  @GetMapping("/lec02")
  public String lec02(Principal prin, ModelMap model) {
    ArrayList<User> user2 = userMapper.selectAll();
    model.addAttribute("user2", user2);
    ArrayList<Match> match5 = matchMapper.selectAllMatch();
    model.addAttribute("match5", match5);
    String loginUser = prin.getName();
    model.addAttribute("login_user", loginUser);

    return "lec02.html";
  }

  @GetMapping("/Match")
  public String match(@RequestParam Integer id, ModelMap model){
    
    return "match.html";
  }

  @GetMapping("/lec02/step2")
  public String lec022(ModelMap model) {
    model.addAttribute("gu", "ぐー");
    return "lec02.html";
  }

  @GetMapping("/lec02/step3")
  public String lec023(ModelMap model) {
    model.addAttribute("choki", "ちょき");
    return "lec02.html";
  }

  @GetMapping("/lec02/step4")
  public String lec024(ModelMap model) {
    model.addAttribute("pa", "ぱー");
    return "lec02.html";
  }
}
