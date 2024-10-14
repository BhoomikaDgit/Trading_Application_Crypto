package com.bhoomi.Trading.model;

import com.bhoomi.Trading.domain.VerificationType;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class TwoFactorAuth {
  private boolean isEnabled=false;
  private VerificationType sendTo;
}
