package com.demo.service;

import com.demo.entities.Notify;

import java.util.List;

public interface NotifyService {

    List<Notify> getAll();

    Notify getById(Integer id);

    Notify create(Notify notify);

    Notify update(Notify notify);

    boolean delete(Integer id);

}
