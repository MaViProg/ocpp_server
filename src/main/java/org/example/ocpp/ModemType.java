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

public class ModemType {

  private String iccid;
  private String imsi;

  /**
   * This contains the ICCID of the modem’s SIM card.
   *
   * @return identifierString[0..20]
   */
  public String getIccid() {
    return iccid;
  }

  /**
   * Optional. This contains the ICCID of the modem’s SIM card.
   *
   * @param iccid identifierString[0..20]
   */
  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  /**
   * This contains the IMSI of the modem’s SIM card.
   *
   * @return identifierString[0..20]
   */
  public String getImsi() {
    return imsi;
  }

  /**
   * Optional. This contains the IMSI of the modem’s SIM card.
   *
   * @param imsi identifierString[0..20]
   */
  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModemType that = (ModemType) o;
    return Objects.equals(iccid, that.iccid) && Objects.equals(imsi, that.imsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, imsi);
  }
}
