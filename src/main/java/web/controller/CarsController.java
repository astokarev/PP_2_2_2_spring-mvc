package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
public class CarsController {


    private CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", carDao.getCars(count.intValue()));
        //model.addAttribute("header", header.header());
        return "cars";
    }
}
