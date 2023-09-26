package com.thang.demo.repository;

import com.thang.demo.entity.Voucher;
import com.thang.demo.entity.VoucherDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author thangdt
 */
public interface VoucherRepository extends JpaRepository<Voucher, String> {
}
