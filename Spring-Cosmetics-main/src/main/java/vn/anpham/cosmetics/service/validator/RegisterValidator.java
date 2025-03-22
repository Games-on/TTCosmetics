package vn.anpham.cosmetics.service.validator;

import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import vn.anpham.cosmetics.domain.dto.RegisterDTO;
import vn.anpham.cosmetics.service.UserService;

@Service
public class RegisterValidator implements ConstraintValidator<RegisterChecked, RegisterDTO> {

    private final UserService userService;

    public RegisterValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(RegisterDTO user, ConstraintValidatorContext context) {
        boolean valid = true;

        // Check if password fields match
        if (!user.getPassword().equals(user.getConfirmPassword())) { // so sánh password nhập vào và confirm password
            context.buildConstraintViolationWithTemplate("Password nhập không chính xác") // Thông báo lỗi
                    .addPropertyNode("confirmPassword")// trường thông tin báo lỗi, phần này để mapping với phan view
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false; // nếu không giống trả ra false
        }

        // Additional validations can be added here
        // check email
        if (this.userService.checkEmailExist(user.getEmail())) {
            context.buildConstraintViolationWithTemplate("Email đã tồn tại")
                    .addPropertyNode("email")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        return valid;
    }
}
