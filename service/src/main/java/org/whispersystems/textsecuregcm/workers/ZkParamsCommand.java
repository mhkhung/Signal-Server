package org.whispersystems.textsecuregcm.workers;

import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;
import org.signal.zkgroup.ServerPublicParams;
import org.signal.zkgroup.ServerSecretParams;
import org.whispersystems.textsecuregcm.util.Base64;

import io.dropwizard.cli.Command;
import io.dropwizard.setup.Bootstrap;

public class ZkParamsCommand extends Command {

  public ZkParamsCommand() {
    super("zkparams", "Generates server zkparams");
  }

  @Override
  public void configure(Subparser subparser) {

  }

  @Override
  public void run(Bootstrap<?> bootstrap, Namespace namespace) throws Exception {
    ServerSecretParams serverSecretParams = ServerSecretParams.generate();
    ServerPublicParams serverPublicParams = serverSecretParams.getPublicParams();

    byte [] public_key = serverPublicParams.serialize();
    byte [] private_key = serverSecretParams.serialize();
    System.out.println("Public: " + Base64.encodeBytes(public_key));
    System.out.println("Private: " + Base64.encodeBytes(private_key));
  }

}
