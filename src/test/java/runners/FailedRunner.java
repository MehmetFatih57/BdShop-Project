package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(plugin={"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",//bu şelikde runnerdan calıştırınca rapor alıyoruz
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOut/failed_scenario.txt"},//bu kodları yazarak rapor olusturmasını sagladık
        //rerun ile belirttiğimiz dosyada failed olan senaryolar tutulur
        features = "@TestOutput/failed_scenario.txt",//rerunda belirttiğimiz txt nin yolunu koyduk ve tag ı sildik
        glue = {"techproed/stepDefinition"},
        dryRun = false,//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki cıktılar tek renk (siyah) olur


)

public class FailedRunner {

}
/*
FailedRunner class'ını olusturma amacımız rerun ile belirttiğimiz yolda fail olan scenarioları
tekrar bu class'dan tum scenario ları tekrar calıstırmak yerine sadece fail olanları calıstırmak için kullanırız.
@CucumberOptions parametresi içine belirttiğimiz features tagına bu class'ta failed olan scenarioları tutan txt
dosyasının yolunu belirtiriz.Dosya yolu belirttiğimiz için önüne @ işareti koymamız gerekir.
 */
