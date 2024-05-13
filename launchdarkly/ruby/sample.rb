module WelcomeHelper
    def check_feature_flags(user, ld_client)
        # If dark mode is enabled, check for high contrast mode
        if ld_client.variation("is-dark-mode-enabled", user, false)
            # Check and report the 'enable-high-contrast' feature flag for the specified user
            high_contrast = ld_client.variation("enable-high-contrast", user, false)
            puts "Dark mode - high contrast mode is #{high_contrast}"
        else
            puts "Light mode!"
        end
    end
    
    def enabled_status(flag_value)
        flag_value ? "enabled" : "disabled"
    end
end
