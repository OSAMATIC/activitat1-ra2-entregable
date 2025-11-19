package acces.dades.activitat2.ra2.activitat_2_ra2_service;

import java.io.BufferedReader;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserService userService;

    try(
    BufferedReader br = new Buffered(new InputStreamReader(file.getInput()))){
            int 
            String line = br.readLine();
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }catch(
    IOException e)
    {
        e.printStackTrace();
    }
}
        