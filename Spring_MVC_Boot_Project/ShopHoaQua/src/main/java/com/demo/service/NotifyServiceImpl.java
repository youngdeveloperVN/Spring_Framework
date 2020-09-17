package com.demo.service;

import com.demo.entities.Notify;
import com.demo.repository.NotifyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyRepository notifyRepository;

    @Override
    public List<Notify> getAll() {
        return notifyRepository.findAll();
    }

    @Override
    public Notify getById(Integer id) {
        return notifyRepository.getOne(id);
    }

    @Override
    public Notify create(Notify notify) {
        return notifyRepository.save(notify);
    }

    @Override
    public Notify update(Notify notify) {
        Notify notifyBase = notifyRepository.getOne(notify.getId());
        if (notifyBase != null) {
            notifyBase = notifyRepository.save(notify);
        }
        return notifyBase;
    }

    @Override
    public boolean delete(Integer id) {
        Notify notifyBase = notifyRepository.getOne(id);
        notifyRepository.delete(notifyBase);
        return true;
    }
}
