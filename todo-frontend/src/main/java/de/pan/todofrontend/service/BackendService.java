package de.pan.todofrontend.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.pan.todofrontend.model.Fusballkarten;

@FeignClient(value = "backendService", url = "http://" + "${BACKEND_URL:localhost}" + ":8080/")
public interface BackendService {
    @RequestMapping(method = RequestMethod.GET, value = "/todo")
    List<Fusballkarten> getFusballkarten();

    @RequestMapping(method = RequestMethod.POST, value = "/todo")
    Fusballkarten createFusballkarten(@RequestBody Fusballkarten fusballkarten);
}
