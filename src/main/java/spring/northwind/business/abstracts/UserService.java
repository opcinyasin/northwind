package spring.northwind.business.abstracts;

import spring.northwind.core.entities.User;
import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResult<User> getByEmail(String email);
}