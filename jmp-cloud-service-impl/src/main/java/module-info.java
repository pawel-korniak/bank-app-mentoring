import com.service.Service;

module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    exports com.serviceImpl;
    provides Service with com.serviceImpl.ServiceImpl;
}