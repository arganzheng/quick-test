package me.arganzheng.study.spring.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("luxury")
@Qualifier("luxury")
public class Lamborghini implements Car {

}
