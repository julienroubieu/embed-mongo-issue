package embedmongo;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongoCmdOptionsBuilder;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

import java.io.IOException;
import java.net.UnknownHostException;

import org.junit.*;

public class IssueTest {

    private MongodExecutable mongodExe;
    private MongodProcess mongod;

    @Before
    public void start() throws IOException {

        MongodStarter runtime = MongodStarter.getDefaultInstance();

        mongodExe = runtime.prepare(new MongodConfigBuilder()
                .version(Version.Main.V2_6)
                .net(new Net(12345, Network.localhostIsIPv6()))
                .cmdOptions(new MongoCmdOptionsBuilder()
                        .useNoJournal(false)
                        .build())
                .build());
        mongod = mongodExe.start();
    }

    @After
    public void stop() {

        mongod.stop();
        mongodExe.stop();
    }


    @Test
    public void emptyTest() {


    }

}
