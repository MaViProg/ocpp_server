package org.example.ocpp;
/*
   ChargeTime.eu - Java-OCA-OCPP

   MIT License

   Copyright (C) 2018 Thomas Volden <tv@chargetime.eu>

   Permission is hereby granted, free of charge, to any person obtaining a copy
   of this software and associated documentation files (the "Software"), to deal
   in the Software without restriction, including without limitation the rights
   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
   copies of the Software, and to permit persons to whom the Software is
   furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in all
   copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
   SOFTWARE.
*/

import java.util.Objects;

public class ChargingStationType {

  private String serialNumber;
  private String model;
  private String vendorName;
  private String firmwareVersion;
  private ModemType modem;

  /**
   * Vendor-specific device identifier.
   *
   * @return string[0..20]
   */
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * Optional. Vendor-specific device identifier.
   *
   * @param serialNumber string[0..20]
   */
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  /**
   * Defines the model of the device.
   *
   * @return string[0..20]
   */
  public String getModel() {
    return model;
  }

  /**
   * Required. Defines the model of the device.
   *
   * @param model string[0..20]
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Identifies the vendor (not necessarily in a unique manner).
   *
   * @return string[0..50]
   */
  public String getVendorName() {
    return vendorName;
  }

  /**
   * Required. Identifies the vendor (not necessarily in a unique manner).
   *
   * @param vendorName string[0..50]
   */
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  /**
   * This contains the firmware version of the Charging Station.
   *
   * @return string[0..50]
   */
  public String getFirmwareVersion() {
    return firmwareVersion;
  }

  /**
   * Optional. This contains the firmware version of the Charging Station.
   *
   * @param firmwareVersion string[0..50]
   */
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  /**
   * Defines the functional parameters of a communication link.
   *
   * @return {@link ModemType}
   */
  public ModemType getModem() {
    return modem;
  }

  /**
   * Optional. Defines the functional parameters of a communication link.
   *
   * @param modem {@link ModemType}
   */
  public void setModem(ModemType modem) {
    this.modem = modem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChargingStationType that = (ChargingStationType) o;
    return Objects.equals(serialNumber, that.serialNumber)
        && Objects.equals(model, that.model)
        && Objects.equals(vendorName, that.vendorName)
        && Objects.equals(firmwareVersion, that.firmwareVersion)
        && Objects.equals(modem, that.modem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, model, vendorName, firmwareVersion, modem);
  }
}
