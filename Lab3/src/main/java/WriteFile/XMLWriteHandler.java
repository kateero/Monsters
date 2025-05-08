package WriteFile;

import Storage.Storage;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class XMLWriteHandler extends BaseWriteHandler {

    @Override
    protected boolean canHandle(String filePath) {
        return filePath.endsWith("xml");
    }

    @Override
    protected void handle(String filePath, Storage storage) {
        try {
            JAXBContext context = JAXBContext.newInstance(Storage.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(storage, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
