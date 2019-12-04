import me.kcybulski.balticlibrary.domain.ApplicationRequest
import me.kcybulski.balticlibrary.domain.ApplicationsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("applications")
class ApplicationsEndpoint(private val applicationsService: ApplicationsService) {

    @GetMapping
    fun getApplications() = applicationsService.list()

    @GetMapping("{id}")
    fun getApplication(@PathVariable id: String) = applicationsService.get(id)

    @PostMapping
    fun addApplication(@RequestBody request: ApplicationRequest) = applicationsService.add(request)

}