package com.practice.abstract_interface;

import java.util.UUID;

public class KmsInterfaceImpl implements KmsInterface {

  private UUID uuid;

  public KmsInterfaceImpl() {
    this.uuid = UUID.randomUUID();
  }

  @Override
  public UUID getId() {
    return null;
  }


}
