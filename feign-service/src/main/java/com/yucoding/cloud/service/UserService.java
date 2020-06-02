package com.yucoding.cloud.service;

import com.yucoding.cloud.domain.CommonResult;
import com.yucoding.cloud.domain.User;
import com.yucoding.cloud.service.impl.UserFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value="user-service",fallback = UserFallbackService.class)
public interface UserService {

    @PostMapping("/user/create")
    CommonResult create(@RequestBody User user);
    @GetMapping("/user/{id}")
    CommonResult<User> getUser(@PathVariable(value = "id", required = false) Long id);

    @GetMapping("/user/getByUsername")
    CommonResult<User> getByUsername(@RequestParam(value = "username") String username);

    @PostMapping("/user/update")
    CommonResult update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    CommonResult delete(@PathVariable(value = "id", required = false) Long id);

}
